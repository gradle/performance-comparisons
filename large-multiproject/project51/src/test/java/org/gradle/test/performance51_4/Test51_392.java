package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_392 {
    private final Production51_392 production = new Production51_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}