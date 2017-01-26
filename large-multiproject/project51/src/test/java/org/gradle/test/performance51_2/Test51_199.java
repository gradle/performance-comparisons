package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_199 {
    private final Production51_199 production = new Production51_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}