package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_406 {
    private final Production51_406 production = new Production51_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}