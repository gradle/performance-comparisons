package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_76 {
    private final Production73_76 production = new Production73_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}