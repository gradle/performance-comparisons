package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_43 {
    private final Production51_43 production = new Production51_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}