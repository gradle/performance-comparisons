package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_320 {
    private final Production19_320 production = new Production19_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}