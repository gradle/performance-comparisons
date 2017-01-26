package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_338 {
    private final Production51_338 production = new Production51_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}