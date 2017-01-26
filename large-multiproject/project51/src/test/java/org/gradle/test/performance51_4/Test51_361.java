package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_361 {
    private final Production51_361 production = new Production51_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}