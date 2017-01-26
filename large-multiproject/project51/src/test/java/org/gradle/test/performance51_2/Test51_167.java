package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_167 {
    private final Production51_167 production = new Production51_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}