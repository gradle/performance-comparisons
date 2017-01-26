package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_382 {
    private final Production51_382 production = new Production51_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}