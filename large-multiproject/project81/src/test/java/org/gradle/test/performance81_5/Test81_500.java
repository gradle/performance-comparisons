package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_500 {
    private final Production81_500 production = new Production81_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}