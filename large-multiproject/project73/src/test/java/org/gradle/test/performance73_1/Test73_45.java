package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_45 {
    private final Production73_45 production = new Production73_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}