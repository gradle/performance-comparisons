package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_39 {
    private final Production51_39 production = new Production51_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}