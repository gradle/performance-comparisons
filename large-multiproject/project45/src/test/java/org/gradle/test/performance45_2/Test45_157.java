package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_157 {
    private final Production45_157 production = new Production45_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}