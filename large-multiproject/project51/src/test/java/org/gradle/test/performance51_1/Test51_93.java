package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_93 {
    private final Production51_93 production = new Production51_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}