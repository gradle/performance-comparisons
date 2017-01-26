package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_73 {
    private final Production51_73 production = new Production51_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}