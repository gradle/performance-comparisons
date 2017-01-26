package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_212 {
    private final Production51_212 production = new Production51_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}