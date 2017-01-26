package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_257 {
    private final Production45_257 production = new Production45_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}