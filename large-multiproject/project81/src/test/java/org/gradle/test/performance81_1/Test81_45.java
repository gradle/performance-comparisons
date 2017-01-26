package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_45 {
    private final Production81_45 production = new Production81_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}