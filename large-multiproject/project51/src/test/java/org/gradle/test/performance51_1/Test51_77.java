package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_77 {
    private final Production51_77 production = new Production51_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}