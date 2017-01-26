package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_257 {
    private final Production51_257 production = new Production51_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}