package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_282 {
    private final Production51_282 production = new Production51_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}