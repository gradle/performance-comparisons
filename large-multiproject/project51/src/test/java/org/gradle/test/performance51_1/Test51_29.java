package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_29 {
    private final Production51_29 production = new Production51_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}