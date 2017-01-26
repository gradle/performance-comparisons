package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_500 {
    private final Production51_500 production = new Production51_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}