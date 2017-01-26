package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_481 {
    private final Production51_481 production = new Production51_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}