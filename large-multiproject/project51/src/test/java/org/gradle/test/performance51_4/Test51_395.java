package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_395 {
    private final Production51_395 production = new Production51_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}