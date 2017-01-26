package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_362 {
    private final Production51_362 production = new Production51_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}