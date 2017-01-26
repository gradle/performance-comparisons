package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_112 {
    private final Production51_112 production = new Production51_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}