package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_85 {
    private final Production35_85 production = new Production35_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}