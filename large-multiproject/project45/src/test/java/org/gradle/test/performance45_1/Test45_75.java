package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_75 {
    private final Production45_75 production = new Production45_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}