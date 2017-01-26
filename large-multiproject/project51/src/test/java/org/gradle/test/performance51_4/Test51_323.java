package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_323 {
    private final Production51_323 production = new Production51_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}