package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_157 {
    private final Production51_157 production = new Production51_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}