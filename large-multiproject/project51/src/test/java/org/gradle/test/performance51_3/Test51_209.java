package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_209 {
    private final Production51_209 production = new Production51_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}