package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_100 {
    private final Production73_100 production = new Production73_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}