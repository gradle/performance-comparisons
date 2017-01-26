package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_282 {
    private final Production2_282 production = new Production2_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}