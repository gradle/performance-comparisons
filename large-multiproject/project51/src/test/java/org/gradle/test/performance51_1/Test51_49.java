package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_49 {
    private final Production51_49 production = new Production51_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}