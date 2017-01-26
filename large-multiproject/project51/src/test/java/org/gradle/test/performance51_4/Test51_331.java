package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_331 {
    private final Production51_331 production = new Production51_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}