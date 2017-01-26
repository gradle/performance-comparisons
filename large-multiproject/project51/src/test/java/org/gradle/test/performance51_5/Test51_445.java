package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_445 {
    private final Production51_445 production = new Production51_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}