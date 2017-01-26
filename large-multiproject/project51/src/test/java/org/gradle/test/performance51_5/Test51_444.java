package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_444 {
    private final Production51_444 production = new Production51_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}