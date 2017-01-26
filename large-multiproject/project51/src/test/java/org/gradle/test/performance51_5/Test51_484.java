package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_484 {
    private final Production51_484 production = new Production51_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}