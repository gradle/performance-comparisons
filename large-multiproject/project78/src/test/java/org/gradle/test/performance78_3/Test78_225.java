package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_225 {
    private final Production78_225 production = new Production78_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}