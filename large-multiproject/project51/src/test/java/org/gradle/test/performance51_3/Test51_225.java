package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_225 {
    private final Production51_225 production = new Production51_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}