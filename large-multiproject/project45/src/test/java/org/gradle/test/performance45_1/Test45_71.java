package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_71 {
    private final Production45_71 production = new Production45_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}