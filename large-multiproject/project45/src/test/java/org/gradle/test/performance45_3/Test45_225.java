package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_225 {
    private final Production45_225 production = new Production45_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}