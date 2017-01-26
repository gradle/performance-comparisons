package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_305 {
    private final Production51_305 production = new Production51_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}