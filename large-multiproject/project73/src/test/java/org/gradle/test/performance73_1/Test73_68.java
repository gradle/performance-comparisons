package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_68 {
    private final Production73_68 production = new Production73_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}