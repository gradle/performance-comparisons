package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_230 {
    private final Production51_230 production = new Production51_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}