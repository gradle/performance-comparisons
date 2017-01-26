package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_9 {
    private final Production45_9 production = new Production45_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}