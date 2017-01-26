package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_27 {
    private final Production81_27 production = new Production81_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}