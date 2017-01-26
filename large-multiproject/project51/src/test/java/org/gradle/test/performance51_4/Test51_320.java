package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_320 {
    private final Production51_320 production = new Production51_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}