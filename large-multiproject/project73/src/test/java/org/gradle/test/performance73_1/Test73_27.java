package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_27 {
    private final Production73_27 production = new Production73_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}