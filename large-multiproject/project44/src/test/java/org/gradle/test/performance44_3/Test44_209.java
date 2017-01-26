package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_209 {
    private final Production44_209 production = new Production44_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}