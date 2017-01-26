package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_166 {
    private final Production45_166 production = new Production45_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}