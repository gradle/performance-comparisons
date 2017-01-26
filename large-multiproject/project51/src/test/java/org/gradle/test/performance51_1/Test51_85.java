package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_85 {
    private final Production51_85 production = new Production51_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}