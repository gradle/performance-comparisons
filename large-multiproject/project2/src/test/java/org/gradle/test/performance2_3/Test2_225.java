package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_225 {
    private final Production2_225 production = new Production2_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}