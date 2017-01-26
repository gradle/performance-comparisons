package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_107 {
    private final Production51_107 production = new Production51_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}