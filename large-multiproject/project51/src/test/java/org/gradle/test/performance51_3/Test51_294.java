package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_294 {
    private final Production51_294 production = new Production51_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}