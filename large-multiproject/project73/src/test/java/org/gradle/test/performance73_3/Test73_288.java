package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_288 {
    private final Production73_288 production = new Production73_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}